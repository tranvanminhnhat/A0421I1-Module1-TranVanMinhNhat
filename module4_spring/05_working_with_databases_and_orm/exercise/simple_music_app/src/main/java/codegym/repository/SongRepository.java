package codegym.repository;

import codegym.entity.Song;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class SongRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Song song) {
        entityManager.persist(song);
    }
//
//    public void updateStudent(Song student) {
//        entityManager.merge(student);
//    }

    public List<Song> getList() {
        return entityManager.createQuery("Select s from Song s").getResultList();
    }
//
//    public void searchStudent(int id) {
//        Song student = entityManager.find(Song.class, id);
//        entityManager.remove(student);
//    }
//
//    public Song findById(int id) {
//        return entityManager.find(Song.class, id);
//    }
//
//    public List<Song> findStudentByName(String name) {
//        List<Song> students = entityManager.createQuery(
//                "select s from Song s where s.name like : name")
//                .setParameter("name", "%" + name + "%")
//                .getResultList();
//        return students;
//    }
//
//    /*
//        numberPage: số trang
//        recordOnPage: số record trên mỗi trang
//     */
//    public List<Song> findStudentByNameWithPaging(String name, int numberPage, int recordOnPage) {
//        List<Song> students = entityManager.createQuery(
//                        "select s from Song s where s.name like :name")
//                .setParameter("name", "%" + name + "%")
//                .setFirstResult((numberPage - 1) * recordOnPage)
//                .setMaxResults(recordOnPage)
//                .getResultList();
//        return students;
//    }
//
//    public List<Song> findStudentByAddress(String address) {
//        List<Song> students = entityManager.createNamedQuery("findByAddress")
//                .setParameter("address", "%" + address + "%")
//                .getResultList();
//        return students;
//    }
}
