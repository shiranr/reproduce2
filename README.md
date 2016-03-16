# reproduce2

Reproduce issue with GORM 3.0.2 when inserting a new element, the 'version' will be integer and not long as expected.<br>

This can be seen in the path: http://127.0.0.1:8080/reproduce2/ - in test controller action index.<br>
Once the version is incremented the the type changes from integer to long.
