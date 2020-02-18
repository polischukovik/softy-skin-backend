db.createUser({
  user: "softyskin",
  pwd: "pwd",
  roles: [
    { role: "readWrite", db: "softyskin" },
  ]
});

db.products.insertMany(
	[
		  {
		    "id": "p01",
		    "name": "Leophilized pig skin XENOGRAFTS",
		    "description": "High quality Lyophilized pig skin from Institute of biomedical technologies",
		    "size": "M",
		    "price": 10,
		    "position": 1,
		    "image": null
		  },
		  {
		    "id": "p02",
		    "name": "Leophilized pig skin XENOGRAFTS",
		    "description": "High quality Lyophilized pig skin from Institute of biomedical technologies",
		    "size": "L",
		    "price": 15,
		    "position": 2,
		    "image": null
		  },
		  {
		    "id": "p03",
		    "name": "Leophilized pig skin XENOGRAFTS",
		    "description": "High quality Lyophilized pig skin from Institute of biomedical technologies",
		    "size": "XL",
		    "price": 20,
		    "position": 3,
		    "image": null
		  }
	]

)