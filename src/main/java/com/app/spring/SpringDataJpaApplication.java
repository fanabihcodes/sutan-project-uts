package com.app.spring;


import org.app.uts.npm222.Buku;
import org.app.uts.repo.BukuRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
  
      
   public CommandLineRunner testBukuRepository(BukuRepository repo){
       return a -> {
       List <Buku> list = repo.findAll();
        System.out.format("%-15s %-40s %-30s %-20s \n", "ID buku ","judul buku","penerbit buku",
                   "pengarang buku","tahun buku");
           System.out.println("-------------------------------------------"
                   + "---------");
       list.forEach(c ->{
           System.out.format("%-15s %-40s %-30s %-20s \n", 
                   c.getIdbuku(),c.getJudul(),
                   c.getPenerbit(),c.getPengarang(),c.getTahun());
          
       });
       };
   }

    @Bean 
  public CommandLineRunner testInsertBuku(BukuRepository repo ){
      return a -> {
          try {
          Buku cus = new Buku();
          cus.setIdbuku("3san");
          cus.setJudul("Belajar Java");
          cus.setPenerbit("muhammad nur");
          cus.setPengarang("owner");
          cus.setTahun("2003"); 
          repo.save(cus);
          System.out.println("data buku berhasil disimpan ");
          } catch (Exception e) {
              System.out.println("data buku gagal disimpan !!");
              System.out.println("error: "+ e.getMessage());
          }
      };
  }
    
     public CommandLineRunner testUpdateBuku(BukuRepository repo ){
      return a -> {
          Buku cus =repo.findById("3san").orElse(null);
          cus.setJudul("sutan fanabih");
          repo.save(cus);
          System.out.println("buku 3san ditemukan " + cus.getJudul());
      };
    }

     @Bean 
     public CommandLineRunner testDeleteBuku(BukuRepository repo ){
      return a -> {
          Buku cus =repo.findById("3san").orElse(null);
          repo.delete(cus);
          System.out.println("buku 3san sudah dihapus ");
      };
    }
}
