package sit.int202.jpa_demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import sit.int202.jpa_demo.entities.Office;

import java.util.List;
import java.util.Random;

public class TestManager {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("classicmodels");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("OFFICE.FIND_BY_CITY");
        query.setParameter("cityParam", "ba%");
        List<Office> offices = query.getResultList();
        for (Office o : offices) {
            System.out.printf("%-2s %-15s %10s %s\n", o.getOfficeCode(),
                    o.getCity(), o.getPhone(), o.getCountry());
        }

        // ค้นหา Office ที่มี officeCode เป็น "1"
//        Office office = em.find(Office.class, "1");
//        System.out.println(office);

//        Office  newOffice = em.find(Office.class, "7");
//
//        // เริ่มการทำธุรกรรม
//        em.getTransaction().begin();
//
//        // สร้าง Office ใหม่
//        office = new Office();
//        office.setOfficeCode((10+new Random().nextInt(100)+""));
//        office.setCity("Bangkok");
//        office.setCountry("Thailand");
//        office.setPhone("357-11-38");
//        office.setTerritory("NA");
//        office.setAddressLine1("126 Pracha-utit");
//        office.setPostalCode("10140");
//
//        // บันทึก Office ใหม่
//        em.persist(newOffice);
//        System.out.println(office);
//
//        // ทำให้การทำธุรกรรมเสร็จสมบูรณ์
//        em.getTransaction().commit();
//
//        em.close();
//        emf.close();

    }
}
