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

        home_page(request)

        self.assertEqual(Item.objects.count(), 1)
        new_item = Item.objects.first()
        self.assertEqual('A new list item', new_item.text)

    def test_home_page_redirects_after_POST(self):
        request = HttpRequest()
        request.method = 'POST'
        request.POST['item_text'] = 'A new list item'

        response = home_page(request)

        self.assertEqual(302, response.status_code)
        self.assertEqual('/', response['location'])

    def test_home_page_only_saves_items_when_neccessary(self):
        request = HttpRequest()
        home_page(request)
        self.assertEqual(0, Item.objects.count())

    def test_home_page_displays_all_list_item(self):
        Item.objects.create(text='item 1')
        Item.objects.create(text='item 2')

        request = HttpRequest()
        response = home_page(request)

        self.assertIn('item 1', response.content.decode())
        self.assertIn('item 2', response.content.decode())


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
