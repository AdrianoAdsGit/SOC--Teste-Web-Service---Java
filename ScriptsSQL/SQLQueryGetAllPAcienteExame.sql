/****** Script for SelectTopNRows command from SSMS  ******/


  use soc;

  select *from PACIENTE_X_EXAME as pce
  inner join paciente as paci on paci.id = pce.ID_PACIENTE
    inner join exame as ex on ex.ID = pce.ID_EXAME
  inner join TIPO_EXAME tpe on tpe.ID = ex.ID_TIP_EXAME


