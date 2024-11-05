package produto;
public class Produto {
	private String nome;
	private String descricao;
	private double preco;
	private String img;
	
		public Produto(String nome, String descricao, double preco, String img){
			this.setNome(nome);
			this.setDescricao(descricao);
			this.setPreco(preco);
			this.setImg(img);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco2) {
			this.preco = preco2;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getImg() {
			return img;
		}

		public void setImg(String img) {
			this.img = img;
		}
}	