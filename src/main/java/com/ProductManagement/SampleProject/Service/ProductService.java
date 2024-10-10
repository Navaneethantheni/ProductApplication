package com.ProductManagement.SampleProject.Service;

import com.ProductManagement.SampleProject.IService.IProductService;
import com.ProductManagement.SampleProject.Entity.Product;
import com.ProductManagement.SampleProject.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        List<Product> product = null;
        try {
            product=productRepository.findAll();
        }catch(Exception e){
            System.out.println(e);
        }
        return product;
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        Optional<Product> product=null;
        try {
            product=productRepository.findById(id);
        }catch(Exception e){
            System.out.println(e);
        }
        return product;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        product.setId(id);
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
