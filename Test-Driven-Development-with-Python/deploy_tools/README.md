# Provisioning tools


## Required packages:

* nginx
* Python 3
* git
* pip
* virtualenv


on Debian/Ubuntu:

```shell
sudo apt-get install nginx python3 git python3-pip
sudo pip3 install virtualenv
```


## Nginx virtual host config

* use nginx.template.conf
* replace SITENAME with your domain


## Upstart job

* use gunicorn-upstart.template.conf
* replace SITENAME with your domain


## New user

You need an user account with a home folder. To create one:

`useradd -m -s /bin/bash USERNAME`
And to make him a sudo user `usermod -a -G sudo USERNAME`

Don't forget to set a password `passwd USERNAME`

Finally to switch user `su - USERNAME`


## Folder structure

```
/home/username
└── sites
└── SITENAME
├── database
├── source
├── static
└── virtualenv
```
