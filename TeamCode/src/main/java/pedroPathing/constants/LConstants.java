package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        //@TODO TUNE THE OTOS FOLLOW THE DOCS
        OTOSConstants.useCorrectedOTOSClass = true;
        OTOSConstants.hardwareMapName = "sensor_otos";
        OTOSConstants.linearUnit = DistanceUnit.INCH;
        OTOSConstants.angleUnit = AngleUnit.RADIANS;
        //@TODO Tune the pose
        OTOSConstants.offset = new SparkFunOTOS.Pose2D(0, 0, Math.PI / 2);
        //@TODO Tune both the scalar
        OTOSConstants.linearScalar = 1.0;
        OTOSConstants.angularScalar = 1.0;
    }
}




