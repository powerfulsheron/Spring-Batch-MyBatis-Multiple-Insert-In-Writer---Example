# Spring-Batch-MyBatis-Multiple-Insert-In-Writer---Example
Example of multiple inserts in generic ItemWriter using external service with MyBatis.

I came across a problem with Spring Batch and MyBatis where i needed to insert non-existing database data of Readed Objects.
I tried to do the inserts in a processor, at first, but Spring Batch ExecutorType was not allowing me to.
So I decided to write my own Writer and to do all the insert in it using a service.
