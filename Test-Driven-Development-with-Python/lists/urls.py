from django.conf.urls import patterns, include, url
from django.contrib import admin


urlpatterns = patterns('lists.views',
    url(r'^(\d+)/$', 'view_list', name='view_list'),
    url(r'^(\d+)/add_item$', 'add_item', name='add_item'),
    url(r'^new$', 'new_list', name='new_list'),
)
