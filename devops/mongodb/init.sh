mongosh -u $MONGO_INITDB_ROOT_USERNAME -p $MONGO_INITDB_ROOT_PASSWORD <<EOF

use cs-m5;

db.createCollection('test');

db.createUser(
    {
        user: 'mongo-user',
        pwd: 'mongo@123ufsk192',
        roles: [
            {
                role: 'readWrite',
                db: 'gravy'
            }
        ]
    }
);

EOF