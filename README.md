DynamicString
=============

build dynamic string resource

use:
String string = DynamicString.newInstance("username:{username}/age:{int}").append("username", "jet").append("int", "23").format();

result:
username:jet/age:23
