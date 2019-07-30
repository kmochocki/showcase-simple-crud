package com.kmochocki.showcase.simplecrud.integration;

import com.kmochocki.showcase.simplecrud.domain.user.User;
import com.kmochocki.showcase.simplecrud.domain.user.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends AuditEntityController<User> {

  public UserController(final UserRepository repository) {
    super(repository);
  }

}
