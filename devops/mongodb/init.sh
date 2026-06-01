mongosh -u $MONGO_INITDB_ROOT_USERNAME -p $MONGO_INITDB_ROOT_PASSWORD <<EOF

use csm5;

db.createCollection('test');

db.createUser(
    {
        user: 'mongo-user',
        pwd: 'adj2ir9w1k3herw9f228',
        roles: [
            {
                role: 'readWrite',
                db: 'gravy'
            }
        ]
    }
);

EOF