public class Movies {
    public static void main(String[] args) {
        String[] indianaMovies = {"Indiana Jones et le Royaume du Crâne de Cristal",
                "Indiana Jones et le Temple Maudit",
                "Indiana Jones et la Dernière Croisade"};
        String[][] mainActors = {indianaMovies,
                {"Harrison Ford, Cate Blanchett, Karen Allen",
                        "Harrison Ford, Kate Capshaw, Jonathan Ke Quan",
                        "Harrison Ford, Sean Connery, Denholm Elliott"
                        }
        };
        for (int i = 0; i < indianaMovies.length; i++) {

            System.out.println("Dans le film "+ indianaMovies[i]+", les principaux acteurs sont : " + mainActors[1][i]);
        }
    }
}