package com.tts.TwitterNew.repository;

//import sun.security.krb5.internal.ccache.Tag;

import com.tts.TwitterNew.model.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
    Tag findByPhrase(String phrase);
}
