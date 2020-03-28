package com.attractor.exam7.service;

import com.attractor.exam7.model.PlaceName;
import com.attractor.exam7.repository.PlaceNameRepository;
import org.springframework.stereotype.Service;

@Service
public class PlaceNameService {
    private final PlaceNameRepository placeNameRepository;

    public PlaceNameService(PlaceNameRepository placeNameRepository) {
        this.placeNameRepository = placeNameRepository;
    }


//    public PlaceNameDTO addPublication(PublicationDTO publicationData) {
//
//        Publication publication = Publication.builder()
//                .images(publicationData.getImages())
//                .description(publicationData.getDescription())
//                .user(User.builder().id(publicationData.getUserId()).build())
//                .dateTime(LocalDateTime.now())
//                .build();
//
//
//        publicationRepository.save(publication);
//        return PublicationDTO.from(publication);
//    }

    public Iterable<PlaceName> getPlaceName() {
        return placeNameRepository.findAll();
    }




}
