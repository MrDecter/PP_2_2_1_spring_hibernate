package hiber.model;


import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    String model;

    @Column(name = "series")
    int series;

    @OneToOne(mappedBy="car", fetch = FetchType.EAGER)
    private User user;

    public Car() {};

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID =" + id +
                ", Модель ='" + model + '\'' +
                ", Серия =" + series +
                ", Пользователь =" + user +
                '}';
    }
}
