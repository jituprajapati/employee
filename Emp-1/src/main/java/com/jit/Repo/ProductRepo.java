package com.jit.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jit.model.product;
@Repository
public interface ProductRepo extends JpaRepository<product, Serializable> {

}
