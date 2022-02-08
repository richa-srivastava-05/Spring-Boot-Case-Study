 package com.librarysys;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Books,Integer>
{
	

}