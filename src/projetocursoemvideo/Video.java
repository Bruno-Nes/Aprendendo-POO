package projetocursoemvideo;

public class Video implements AcoesVideo{
    private String tituloVideo;
    private int avaliacao;
    private int views;
    private int like;
    private int deslike;
    private boolean reproduzindo;

    public Video(String tituloVideo) {
        this.tituloVideo = tituloVideo;
        this.avaliacao = 0;
        this.views = 0;
        this.like = 0;
        this.deslike = 0;
        this.reproduzindo = false;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDeslike() {
        return deslike;
    }

    public void setDeslike(int deslike) {
        this.deslike = deslike;
    }

    public String getTituloVideo() {
        return tituloVideo;
    }

    public void setTituloVideo(String tituloVideo) {
        this.tituloVideo = tituloVideo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    // Métodos abstratos para serem sobrescritos
    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }

    @Override
    public void deslike() {

    }
}
