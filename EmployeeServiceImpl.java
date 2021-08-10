package net.guides.springboot.crud.servicess;

import net.guides.springboot.crud.model.Employee;
import net.guides.springboot.crud.repository.EmployeeRepository;
import net.guides.springboot.crud.service.SequenceGeneratorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmplyeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;
    @Override
    public void initEmployees() {
            //String T[]={"Mohamed","Mouad","Meryem","Imane","Jaafar","Zakaria","Yassir","Ibrahim","Soukaina","Anas","Achraf"};
            //String T1[]={"Ghafour","Jazouli","Nokairi","Moumni","Saadaoui","Najah","Moufidi","Harrati","Sadiki","Marachi","Maksi"};
            //for(int i = 0; i<100000; i++){
            //for(int i = 0; i<2; i++){
                //int rnd = new Random().nextInt(T.length);
                //Stream.of(T[rnd]).forEach(nomClient->{
                Stream.of("A","B").forEach(nomEmployee->{
                    //
                    Employee employee=new Employee();
                    employee.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
                    employee.setFirstName(nomEmployee);
                    //client.setTel("06"+(10000000 + (int)(Math.random() * ((99999999 - 10000000) + 1))));
                    //client.setEmail(10000 + (int)(Math.random() * ((99999 - 10000) + 1))+nomClient+"@gmail.com");
                    employee.setLastName("Mohamed");
                    employee.setEmailId("A@gmail.com");
                    //
                    //int rnd1 = new Random().nextInt(T1.length);
                    //client.setPrenomClient(T1[rnd1]);
                    //
                    employeeRepository.save(employee);
                });


    }
}
