from django.core.urlresolvers import resolve
from django.http import HttpRequest
from django.template.loader import render_to_string
from django.test import TestCase

from .models import Item
from .views import home_page


class HomePageTest(TestCase):

    def test_root_url_resolves_to_home_page_view(self):
        found = resolve('/')
        self.assertEqual(found.func, home_page)

    def test_home_page_return_correct_html(self):
        request = HttpRequest()
        response = home_page(request)
        expected = render_to_string('home.html')
        self.assertEqual(expected, response.content.decode())

    def test_home_page_can_save_a_POST_request(self):
        request = HttpRequest()
        request.method = 'POST'
        request.POST['item_text'] = 'A new list item'

        response = home_page(request)
        self.assertIn('A new list item', response.content.decode())
        expected_html = render_to_string('home.html',
            {'new_item_text': 'A new list item'})
        self.assertEqual(expected_html, response.content.decode())


class ItemModelTest(TestCase):

    def test_saving_and_retrieving_items(self):
        first_item = Item.objects.create(text='The first (ever) list item')
        second_item = Item.objects.create(text='Item the second')
        saved_items = Item.objects.all()

        self.assertEqual(2, saved_items.count())
        first_item_saved = saved_items[0]
        second_item_saved = saved_items[1]

        self.assertEqual(first_item.text, first_item_saved.text)
        self.assertEqual(second_item.text, second_item_saved.text)
