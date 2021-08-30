# graphql-advance-learning
This is advance level learning of GraphQL API using spring boot &amp; facebook data loader

## About the GraphQL API
> The GitHub GraphQL API offers flexibility and the ability to define precisely the data you want to fetch.

## Queries and Mutations
> Fields
At its simplest, GraphQL is about asking for specific fields on objects. Let's start by looking at a very simple query and the result we get when we run it:

### GraphQL Request Payload
```.grqphql
query{
  student(firstName: "Singh"){
    city
    firstName
    lastName
    email
    street
    learningSubjects {
      subjectName
    }
  }
}

```

### GraphQL JSON Response
```.json
{
  "data": {
    "student": {
      "city": "any street",
      "firstName": "Singh",
      "lastName": "Donga",
      "email": "Sachin@ponda.com",
      "street": null,
      "learningSubjects": [
        {
          "subjectName": "Java"
        },
        {
          "subjectName": "MongoDB"
        }
      ]
    }
  }
}
```




Follow me on - [Medium](https://saurabhshcs.medium.com) | [Linkedin](https://www.linkedin.com/in/saurabhshcs/) | [YouTube](https://www.youtube.com/channel/UCSQqjPw7_tfx1Ie4yYHbcxQ?pbjreload=102) | [StackOverFlow](https://stackoverflow.com/users/10719720/saurabhshcs?tab=profile)


