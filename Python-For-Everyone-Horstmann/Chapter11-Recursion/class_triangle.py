# Class triangle


class Triangle():
    def __init__(self, side_length):
        self._side_length = side_length

    def get_side_length(self):
        return self._side_length

    def area(self):
        if self._side_length <= 0:
            return 0
        smaller_triangle = Triangle(self._side_length - 1)
        smaller_area = smaller_triangle.area()
        return smaller_area + self._side_length
