# spring-boot-blog-kotlin

#### Run this project by these commands :
1. `git clone https://github.com/hendisantika/spring-boot-blog-kotlin.git`
2. `cd spring-boot-blog-kotlin`
3. `gradle clean bootRun`

`GET /users?page=0&size=20`

http://localhost:8080/users?page=0&size=20

```

{

    "_embedded": {
        "userList": [
            {
                "id": 1,
                "fullName": "User 1",
                "password": "pwd1",
                "email": "user1@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/1"
                    }
                }
            },
            {
                "id": 2,
                "fullName": "User 2",
                "password": "pwd1",
                "email": "user2@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/2"
                    }
                }
            },
            {
                "id": 3,
                "fullName": "User 3",
                "password": "pwd1",
                "email": "user3@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/3"
                    }
                }
            },
            {
                "id": 4,
                "fullName": "User 4",
                "password": "pwd1",
                "email": "user4@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/4"
                    }
                }
            },
            {
                "id": 5,
                "fullName": "User 5",
                "password": "pwd1",
                "email": "user5@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/5"
                    }
                }
            },
            {
                "id": 6,
                "fullName": "User 6",
                "password": "pwd1",
                "email": "user6@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/6"
                    }
                }
            },
            {
                "id": 7,
                "fullName": "User 7",
                "password": "pwd1",
                "email": "user7@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/7"
                    }
                }
            },
            {
                "id": 8,
                "fullName": "User 8",
                "password": "pwd1",
                "email": "user8@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/8"
                    }
                }
            },
            {
                "id": 9,
                "fullName": "User 9",
                "password": "pwd1",
                "email": "user9@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/9"
                    }
                }
            },
            {
                "id": 10,
                "fullName": "User 10",
                "password": "pwd1",
                "email": "user10@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/10"
                    }
                }
            },
            {
                "id": 11,
                "fullName": "User 11",
                "password": "pwd1",
                "email": "user11@gmail.com",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/users/11"
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/users?page=0&size=20"
        }
    },
    "page": {
        "size": 20,
        "totalElements": 11,
        "totalPages": 1,
        "number": 0
    }

}
```

