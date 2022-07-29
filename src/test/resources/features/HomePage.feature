Feature: Home Page
# home page menus : Bekleidung, Schuhe, Klettern, Ausrüstung, Bike, Winter, Marken, Outlet

  @mf
  Scenario: As a user I should be able to see home page menus when I enter the homepage
    Given the user enters the home page
    Then the user should be able to see following menus
      | Bekleidung |
      | Schuhe     |
      | Klettern   |
      | Ausrüstung |
      | Bike       |
      | Winter     |
      | Marken     |
      | Outlet     |