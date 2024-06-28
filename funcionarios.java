package sistemadecartoesMGS;

public class funcionarios {
	 private int id;
	    private String nome;
	    private String telefone;
	    private String email;
	    private String alergias;
	    private String problemasMedicos;

	    
	    
	    
	    
	    
	    // Construtor
	    void setId(int id) {
			this.id = id;
		}

		void setNome(String nome) {
			this.nome = nome;
		}

		void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		void setEmail(String email) {
			this.email = email;
		}

		void setAlergias(String alergias) {
			this.alergias = alergias;
		}

		void setProblemasMedicos(String problemasMedicos) {
			this.problemasMedicos = problemasMedicos;
		}

		public void Funcionario(int id, String nome, String telefone, String email, String alergias, String problemasMedicos) {
	        this.id = id;
	        this.nome = nome;
	        this.telefone = telefone;
	        this.email = email;
	        this.alergias = alergias;
	        this.problemasMedicos = problemasMedicos;
	    }

		public void cartao() {
			System.out.println("Nome: " + this.getNome() + 
					            "id: " + this.getId() +
					                "telefone: " + this.getTelefone() + 
					                    "email: " + this.getEmail() + 
					                           "alergias: " + this.getAlergias()  +
					                                    "problemasmedicos: " + this.getProblemasMedicos() );
		}
		
		
	    @SuppressWarnings("unused")
		private String getUnused() {
			// TODO Auto-generated method stub
			return null;
		}

		// Getters
	    public int getId() {
	        return id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getAlergias() {
	        return alergias;
	    }

	    public String getProblemasMedicos() {
	        return problemasMedicos;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + "\n" +
	               "Nome: " + nome + "\n" +
	               "Telefone: " + telefone + "\n" +
	               "Email: " + email + "\n" +
	               "Alergias: " + alergias + "\n" +
	               "Problemas Médicos: " + problemasMedicos + "\n";
	    }
}
