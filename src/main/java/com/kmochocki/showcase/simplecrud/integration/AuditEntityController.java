package com.kmochocki.showcase.simplecrud.integration;

import com.kmochocki.showcase.simplecrud.domain.AuditEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class AuditEntityController<Entity extends AuditEntity> {

  private final CrudRepository<Entity, Long> repository;

  public AuditEntityController(final CrudRepository<Entity, Long> repository) {
    this.repository = repository;
  }

  @PostMapping
  public void createUser(@RequestBody final Entity entity) {
    repository.findById(entity.getId()).ifPresent(existingUser -> {
      throw new RuntimeException("User already exists: " + existingUser);
    });
    repository.save(entity);
  }

  @GetMapping("/{entityId}")
  public Entity getUser(@PathVariable final long entityId) {
    return repository.findById(entityId).orElseThrow(ResourceNotFoundException::new);
  }

  @GetMapping()
  public Iterable<Entity> getAllUsers() {
    return repository.findAll();
  }

  @DeleteMapping("/{entityId}")
  public void deleteUser(@PathVariable final long entityId) {
    repository.deleteById(entityId);
  }

}
