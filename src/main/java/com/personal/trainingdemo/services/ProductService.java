package com.personal.trainingdemo.services;

import com.personal.trainingdemo.beans.ProductDTO;
import com.personal.trainingdemo.entities.Product;
import com.personal.trainingdemo.repositories.ProductRepository;
import com.personal.trainingdemo.utils.DTOEntityMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository productRepo;
    @Autowired
    private DTOEntityMapping mapper;

    /**
     * Get all products
     * @return List<ProductDTO>
     */
    public List<ProductDTO> getAllProducts() {
        logger.trace("Inside getAllProducts()");

        List<ProductDTO> returnedProductsList = new ArrayList<>();
        /*Iterable<Product> productIterable = productRepo.findAll();
        for (Product p :
                productIterable) {
            ProductDTO productDto = mapper.getProductDTOFromEntity(p);
            returnedProductsList.add(productDto);
        }*/
        productRepo.findAll().forEach(p -> returnedProductsList.add(mapper.getProductDTOFromEntity(p)));

        return returnedProductsList;
    }

    /**
     * Get product by product ID.
     *
     * @param id
     * @return Product
     */
    public ProductDTO getProduct(BigInteger id) {
        logger.trace("Inside getProduct(String id)");

        try {
            if (id == null) {
                throw new NullPointerException("input ID null");
            }

            Optional<Product> productOptional = productRepo.findById(id);
            if(productOptional.isPresent()) {
                return mapper.getProductDTOFromEntity(productOptional.get());
            }

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    /**
     * Add product if already present
     *
     * @param productDto
     * @return int
     */
    public int addProduct(ProductDTO productDto) {
        logger.trace("Inside addProduct(Product product)");

        try {
            if (productDto == null) {
                throw new NullPointerException("input product null");
            }

            productRepo.save(mapper.getProductEntityFromDTO(productDto));

            return 0;

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return 1;
    }

}
