package com.kmochocki.showcase.simplecrud.domain.message;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.kmochocki.showcase.simplecrud.domain.AuditEntity;
import com.kmochocki.showcase.simplecrud.domain.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@SequenceGenerator(name = "idgen", sequenceName = "message_id_gen")
public class Message extends AuditEntity {

  @ManyToOne(cascade = CascadeType.PERSIST)
  @NotNull
  private User sender;
  @ManyToOne(cascade = CascadeType.PERSIST)
  @NotNull
  private User receiver;
  @NotBlank
  private String text;

}
