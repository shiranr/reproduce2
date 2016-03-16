package com.jfrog.reproduce

import com.mongodb.BasicDBObject
import com.mongodb.DB
import com.mongodb.DBCollection
import com.mongodb.Mongo

class TestController {

    def index() {
        User user = new User([name: 'name'])
        user.save(flush: true, failOnError: true)
        Mongo mongo = new Mongo('127.0.0.1', 27017)
        DB localDB = mongo.getDB('reproduce2')
        DBCollection collection = localDB.getCollection('user')
        def result = collection.findOne(new BasicDBObject('name', 'name'))
        assert result.version.class == Integer.class
        assert result.version.class == Long.class
        render(view: 'index')
    }
}
