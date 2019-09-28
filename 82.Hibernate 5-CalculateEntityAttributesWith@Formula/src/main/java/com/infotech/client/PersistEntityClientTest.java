package com.infotech.client;

import com.infotech.entities.Account;
import com.infotech.util.HibernateUtil;
import org.hibernate.Session;


public class PersistEntityClientTest {
    public static void main(String[] args) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Account account = new Account ();
            account.setCredit(9000.00);
            account.setRate(8.37);

            session.beginTransaction();
            session.save(account);
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}