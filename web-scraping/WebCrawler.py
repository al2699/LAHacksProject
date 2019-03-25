#Remember string[19:-8] for removing tags from titles
import requests
import firebase_admin
from firebase_admin import credentials
from firebase_admin import firestore
from bs4 import BeautifulSoup
from HTMLParser import HTMLParser


#Dictionary mapping HTML entity types to unicode equivalents
"""
dictionary = {
    "nbsp":" "
    "lt":"<"
    "amp":"&"
    "quot":"\"\""
    "apos":"\'"
    }
"""

#Initialize firestore
# Use the application default credentials
cred = credentials.ApplicationDefault()
firebase_admin.initialize_app(cred, {
  'projectId': "group-2720d",
})

db = firestore.client()

#Initialize html parser
h = HTMLParser()

url = "https://25livepub.collegenet.com/calendars/miracosta-college-events.xml"
resp = requests.get(url)

soup = BeautifulSoup(resp.content, features="xml")
entries = soup.find_all('entry')
#Can use entires[i].find('title')
#Or entries[i].find('content')

"""
TODO: Need to figure out the parsing for parsing the date, location, and date
from the content portion of a given xml event entry. Also need to figure how to
map the HTML specific entities to unicode (i.e. convert &ndash; to -)
"""

#Parses the title from a title string
def parse_title(title_string):
    return title_string[19:-8]

#Parses the location
def parse_location(content):
    possible_location = ""
    for i in range(0, len(content)):
        temp_str = content[i:i+11]
        if(temp_str == "&lt;br/&gt;"):
            break
        possible_location += content[i]

    return possible_location

#Parses the date
def parse_date(content):
    print("nothing")
