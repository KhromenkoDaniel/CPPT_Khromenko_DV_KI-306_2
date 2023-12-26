import os

class Cookstove:
    def __init__(self, cookstovecondition="None", fire=0, status=False, name="None", length=0, width=0, gasbag=False, oven=False, burner=0):
        self.cookstovecondition = cookstovecondition
        self.fire = fire
        self.status = status
        self.name = name
        self.length = length
        self.width = width
        self.gasbag = gasbag
        self.oven = oven
        self.burner = burner

        # Ensure the directory exists before opening the file
        log_directory = "log"
        os.makedirs(log_directory, exist_ok=True)
        log_file_path = os.path.join(log_directory, "Log.txt")
        self.my_write = open(log_file_path, "w")

    def get_cookstove_condition(self):
        return self.cookstovecondition

    def set_cookstove_condition(self, cookstovecondition):
        self.cookstovecondition = cookstovecondition

    def get_fire(self):
        return self.fire

    def set_fire(self, fire):
        self.fire = fire

    def get_status(self):
        return self.status

    def set_status(self, status):
        self.status = status

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_length(self):
        return self.length

    def set_length(self, length):
        self.length = length

    def get_width(self):
        return self.width

    def set_width(self, width):
        self.width = width

    def get_gasbag(self):
        return self.gasbag

    def set_gasbag(self, gasbag):
        self.gasbag = gasbag

    def get_oven(self):
        return self.oven

    def set_oven(self, oven):
        self.oven = oven

    def get_burner(self):
        return self.burner

    def set_burner(self, burner):
        self.burner = burner

    def off_on_cookstove(self):
        if self.status:
            self.my_write.write("The gas stove is on\n")
        else:
            self.my_write.write("The gas stove is off\n")

    def settings(self):
        print(f"Name - {self.name}")
        print(f"The length - {self.length} cm")
        print(f"The width - {self.width} cm")
        self.my_write.write("The stove setting is displayed\n")

    def true_false_oven(self):
        if self.oven:
            self.my_write.write("The oven is included in the complete set with a stove\n")
        else:
            self.my_write.write("The stove is not included in the complete set with a stove\n")

    def true_false_gasbag(self):
        if self.gasbag:
            self.my_write.write("The gas bag is included in the complete set with a stove\n")
        else:
            self.my_write.write("The stove is not included in the complete set with a stove\n")

    def change_burner(self, bur):
        print(f"Selected burner - {self.burner}")
        self.my_write.write(f"The burner changed from {self.burner} to {bur}\n")
        print(f"The burner changed to {bur}")

    def fire_status_plus(self, change):
        self.fire += change
        self.my_write.write(f"The fire is increased on {change}%\n")

    def fire_status_minus(self, change):
        self.fire -= change
        self.my_write.write(f"The fire is reduced on {change}%\n")

    def condition(self):
        if self.cookstovecondition == "Great":
            self.my_write.write("The stove is in good condition\n")

    def condition2(self):
        if self.cookstovecondition == "Bad":
            self.my_write.write("The stove is in bad condition, it needs to be repaired\n")

    def extract(self):
        if self.status:
            self.my_write.write("Turn on the hood while cooking\n")

    def dispose(self):
        self.my_write.flush()
        self.my_write.close()


if __name__ == "__main__":
    object = Cookstove("Great", 10, True, "Bosch", 50, 70, True, True, 1)

    object.off_on_cookstove()
    object.settings()
    object.true_false_oven()
    object.true_false_gasbag()

    object.change_burner(3)
    object.fire_status_plus(30)
    object.fire_status_minus(5)
    object.condition()
    object.condition2()

    object.extract()
    object.dispose()
