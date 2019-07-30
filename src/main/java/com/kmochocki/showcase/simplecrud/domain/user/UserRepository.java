package com.kmochocki.showcase.simplecrud.domain.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
