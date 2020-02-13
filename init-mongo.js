db.grantRolesToUser ( "admin", [  { role: "__system", db: "admin" } ] );
db.getSiblingDB("admin").system.version.update({ _id: "authSchema" },{ $set: { currentVersion: 3 } });

db.getSiblingDB("unitask").createUser(
	{
		user: "unitask",
		pwd: "password",
		roles: [
			{ role: "readWrite", db: "unitask"}
		]
	}
);