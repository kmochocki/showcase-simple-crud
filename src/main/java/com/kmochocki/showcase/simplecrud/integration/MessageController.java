package com.kmochocki.showcase.simplecrud.integration;

import com.kmochocki.showcase.simplecrud.domain.message.Message;
import com.kmochocki.showcase.simplecrud.domain.message.MessageRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController extends AuditEntityController<Message> {

  public MessageController(final MessageRepository repository) {
    super(repository);
  }

}
