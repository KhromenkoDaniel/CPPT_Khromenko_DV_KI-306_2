import os

class Clean:
    def clean(self):
        pass  # Placeholder for the clean method

class Cook:
    def __init__(self, cookstovecondition=None, fire=None, status=None, name=None, length=None, width=None,
                 gasbag=None, oven=None, burner=None):
        self.cookstovecondition = cookstovecondition or "None"
        self.fire = fire or 0
        self.status = status or False
        self.name = name or "None"
        self.length = length or 0
        self.width = width or 0
        self.gasbag = gasbag or False
        self.oven = oven or False
        self.burner = burner or 0
        log_dir = "./lab_9/"
        os.makedirs(log_dir, exist_ok=True)
        self.my_write = open(os.path.join(log_dir, "Log.txt"), "w")

    def get_cookstovecondition(self):
        return self.cookstovecondition

    def set_cookstovecondition(self, cookstovecondition):
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
        print("Name -", self.name)
        print("The length -", self.length, "cm")
        print("The width -", self.width, "cm")
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
        print("Selected burner -", self.burner)
        self.my_write.write("The burner changed from {} to {}\n".format(self.burner, bur))
        print("The burner changed to", bur)

    def fire_status_plus(self, change):
        self.fire += change
        self.my_write.write("The fire is increased on {}%\n".format(change))

    def fire_status_minus(self, change):
        self.fire -= change
        self.my_write.write("The fire is reduced on {}%\n".format(change))

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


class GasStove(Cook, Clean):
    def __init__(self, cookstovecondition, fire, status, name, length, width, gasbag, oven, burner, capacity, pollution):
        super().__init__(cookstovecondition, fire, status, name, length, width, gasbag, oven, burner)
        self.capacity = capacity
        self.pollution = pollution

    def status_cookstove(self, time):
        if self.status:
            self.my_write.write("The gas stove is on\n")
            print("The gas stove is on")
            self.capacity -= time / 60
            self.my_write.write("The gas capacity in the gas cylinder is reduced by {} liters during {} minutes\n".format(time / 60, time))
            print("The gas capacity in the gas cylinder is reduced by {} liters during {} minutes".format(time / 60, time))
        else:
            self.my_write.write("The gas stove is off\n")

    def clean(self):
        self.pollution = 0
        self.my_write.write("Gas stove was cleaned\n")
        print("Gas stove was cleaned")


def main():
    object = GasStove("Great", 10, True, "Bosch", 50, 70, True, True, 1, 10, 0)
    object.off_on_cookstove()
    object.settings()
    object.true_false_oven()
    object.true_false_gasbag()

    object.change_burner(3)
    object.fire_status_plus(30)
    object.fire_status_minus(5)
    object.condition()
    object.condition2()
    object.status_cookstove(20)
    object.clean()

    object.extract()
    object.dispose()


if __name__ == "__main__":
    main()
