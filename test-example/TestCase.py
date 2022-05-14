from Result import TestResult


class TestCase:
    def __init__(self, name):
        self.name = name

    def run(self):
        result = TestResult()
        result.testStarted()
        self.setUp()
        try:
            method = getattr(self, self.name)
            method()
        except:
            result.testFaild()
        self.tearDown()
        return result

    def setUp(self):
        pass

    def tearDown(self):
        pass