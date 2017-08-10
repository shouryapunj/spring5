//package pack;
//
//import org.hibernate.*;
//import org.hibernate.cfg.Configuration;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Component;
//
//
//import javax.management.Query;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.logging.Logger;
//
//
//@Component
//public class App {
//
//
//    public List<Bdata> d(String a) {
//        String ifsc = a;
//
//        Configuration con = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory sf = con.buildSessionFactory();
//        Session session = sf.getCurrentSession();
//
//        List<Bdata> BdataList = new ArrayList<Bdata>();
//
//        try {
//            session.beginTransaction();
//
//            Criteria criteria = session.createCriteria(Bdata.class);
//            List res = criteria.list();
//
//            /*Hibernate Named Query*/
////            Query query = session.getNamedQuery("findBdataByIfsc");
////            query.setString("ifsc","%");
//
//
////            String hql = "FROM Bdata WHERE ifsc like '%" + ifsc + "%'";
////            Query query = session.createQuery(hql);
////            Query query;
////            List results = query.list();
////            List results =
//
//            int count = 0;
////            for (Iterator iterator = results.iterator(); iterator.hasNext(); ) {
////                Bdata b = (Bdata) iterator.next();
//////                System.out.println("BANK = " + b.getBank() + ", IFSC = " + b.getIfsc() + ", BRANCH = " + b.getBranch() + ", ADDRESS = " + b.getAddress() + ", CONTACT = " + b.getContact() + ", CITY = " + b.getCity() + ", DISTRICT = " + b.getDistrict() + ", STATE = " + b.getState());
////
////                BdataList.add(b);
////                count++;
////            }
////
////            for (int i = 0; i < BdataList.size(); i++) {
////                System.out.println(BdataList.get(i).toString());
////            }
//
//            System.out.println("Count = " + count);
//            session.getTransaction().commit();
//
//        } catch (HibernateException e) {
//            session.getTransaction().rollback();
//            Logger.getLogger("con").info("Exception: " + e.getMessage());
//            e.printStackTrace(System.err);
//        }
//
//            return BdataList;
//    }
//
//}