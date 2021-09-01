# GraphQL Mutation Learning

> If you have an API endpoint that alters data, like inserting data into a database or altering data already in a database, you should make this endpoint a `Mutation` rather than a `Query`. This is as simple as making the API endpoint part of the top-level `Mutation` type instead of the top-level `Query` type.

Let's say we have a “message of the day” server, where anyone can update the message of the day, and anyone can read the current one. The GraphQL schema for this is simply:

```.json
type Mutation {
  setMessage(message: String): String
}

type Query {
  getMessage: String
}
```


Follow me on - [Medium](https://saurabhshcs.medium.com) | [Linkedin](https://www.linkedin.com/in/saurabhshcs/) | [YouTube](https://www.youtube.com/channel/UCSQqjPw7_tfx1Ie4yYHbcxQ?pbjreload=102) | [StackOverFlow](https://stackoverflow.com/users/10719720/saurabhshcs?tab=profile)
