use soc;
SELECT * FROM PACIENTE  AS paci 
   
 inner join paciente_X_exame as pe
  on  pe.ID_PACIENTE = paci.ID 

   inner join exame as e
   on e.id = pe.ID_EXAME

   inner join tipo_exame as t 
   on t.id = e.ID_TIP_EXAME
      
   where paci.id =?