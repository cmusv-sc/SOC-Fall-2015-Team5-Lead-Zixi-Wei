package models;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by Zixi Wei, Mingyang Ling, Zheng Lei, Sen Yue on 11/30/15.
 */
@Named
@Singleton
public interface NewTagRepository extends CrudRepository<NewTag, Long>{
    NewTag findFirstByName(String name);
}
