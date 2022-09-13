docker pull postgres
docker run --name coffeshoptest -e POSTGRES_PASSWORD=postgres -p 3306:3306 -d postgres