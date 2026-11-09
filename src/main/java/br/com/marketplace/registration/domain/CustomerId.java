package br.com.marketplace.registration.domain;

import jakarta.persistence.Embeddable;
import java.util.UUID;

@Embeddable
public record CustomerId(UUID id) {
}
