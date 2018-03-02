
public class Resource {

	String identification; //1 -> sala de laboratório
						  //2 -> sala de auditório
						  //3 -> sala de aula
						  //4 -> sala com projetor
	
	int schedule; //1 -> 7:30 às 9:10
				 //2 -> 9:20 às 11:00
				 //3 -> 11:10 às 12:50
				 //4 -> 13:30 às 15:10
				 //5 -> 15:20 às 17:00
				 //6 -> 17:10 às 18:50
	
	String requestor_user; 
	String responsible_user; //só pode ser professor, pesquisador ou administrador do sistema
	
	int aloc_status; //0 -> Disponível
					//1 -> "Em processo de alocação"
					//2 -> "Alocado"
					//3 -> "Em andamento"
					//4 -> "Concluído"
	
	int activity; //1 -> aula tradicional (só usuário 4, professor)
				   //2 -> aula de laboratório (só usuário 4, professor)
				   //3 -> aula de apresentações
	
	String activity_description;
	
	//ListadeUsuarios AtivParticipantes; //lista de usuarios
	
	String activity_support_material; //arquivo com apresentações ou código fonte
	
}