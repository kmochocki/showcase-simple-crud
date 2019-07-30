package com.kmochocki.showcase.simplecrud.domain.user;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

import com.kmochocki.showcase.simplecrud.domain.AuditEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@SequenceGenerator(name = "idgen", sequenceName = "user_id_gen")
public class User extends AuditEntity {

  @NotBlank
  private String name;

}
