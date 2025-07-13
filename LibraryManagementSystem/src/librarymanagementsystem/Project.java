package librarymanagementsystem;

public class Project extends Item {

    enum Study_year {
        Third_Year, Fourth_Year, Fifth_Year
    }
    private Study_year study_year;
    private String team;

    public Project(String id, String title, int year, Category category, Study_year study_year, String team) {
        super(id, title, year, category);
        this.study_year = study_year;
        this.team = team;
    }

    @Override
    public void ShowInfo() {
        System.out.printf("\n%s : Project title : %s  ,  Year : %s  ,  Study Year : %s  ,  Category : %S  ,  Team : %s .\n", id, title, String.valueOf(year), String.valueOf(study_year), String.valueOf(category), team);
    }

}
