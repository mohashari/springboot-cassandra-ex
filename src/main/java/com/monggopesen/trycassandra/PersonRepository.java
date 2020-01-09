package com.monggopesen.trycassandra;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface PersonRepository extends CassandraRepository<Person, String> {
}
