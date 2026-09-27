public class Main {
    public static void main(String[] args) {
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem  librarySystem = new LibrarySystem();

        SchoolManagementApp AttendanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp GradingSystemAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp LibrarySystemAdapter = new LibrarySystemAdapter(librarySystem);

        System.out.println("\nSchool Management System");
        AttendanceSystemAdapter.integrateSystem();
        GradingSystemAdapter.integrateSystem();
        LibrarySystemAdapter.integrateSystem();
    }
}