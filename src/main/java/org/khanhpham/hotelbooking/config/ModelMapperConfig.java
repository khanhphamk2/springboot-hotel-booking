package org.khanhpham.hotelbooking.config;

//import com.springboot.hotelbooking.entity.*;
//import com.springboot.hotelbooking.dto.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);

//        modelMapper.addMappings(new PropertyMap<Payment, PaymentDTO>() {
//            @Override
//            protected void configure() {
//                map().setCreateDate(String.valueOf(source.getCreatedDate()));
//                map().setUpdateDate(String.valueOf(source.getLastModifiedDate()));
//                map().setCreateBy(source.getCreatedBy());
//                map().setUpdateBy(source.getLastModifiedBy());
//            }
//        });
//        modelMapper.addMappings(new PropertyMap<Order, OrderDTO>() {
//            @Override
//            protected void configure() {
//                map().setCreateDate(String.valueOf(source.getCreatedDate()));
//                map().setUpdateDate(String.valueOf(source.getLastModifiedDate()));
//                map().setCreateBy(source.getCreatedBy());
//                map().setUpdateBy(source.getLastModifiedBy());
//            }
//        });
//
//        modelMapper.addMappings(new PropertyMap<Book, ShortBookDTO>() {
//            @Override
//            protected void configure() {
//                map().setCreateDate(String.valueOf(source.getCreatedDate()));
//                map().setUpdateDate(String.valueOf(source.getLastModifiedDate()));
//                map().setCreateBy(source.getCreatedBy());
//                map().setUpdateBy(source.getLastModifiedBy());
//            }
//        });
//
//        modelMapper.addMappings(new PropertyMap<Post, PostDTO>() {
//            @Override
//            protected void configure() {
//                map().setCreateDate(String.valueOf(source.getCreatedDate()));
//                map().setUpdateDate(String.valueOf(source.getLastModifiedDate()));
//                map().setCreateBy(source.getCreatedBy());
//                map().setUpdateBy(source.getLastModifiedBy());
//            }
//        });
//
        return modelMapper;
    }
}
