# Getting Started

### Middleware

#### Postgres

#### Mongo

#### RabbitMQ
 
User: `rabbit`

Password: `ouw802jfsoaqsas`

To generate password use `password_utils.py` script

```
python3 password_utils.py <your_password>
```

In console you will see hashed password and copy/paste it into 
* `rabbitmq.conf` - option `default_pass`
* `rabbitmq.json` - option `password_hash` in section `users`